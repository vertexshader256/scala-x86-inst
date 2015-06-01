package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Jump short if below or equal/not above (CF=1 AND ZF=1)
// Category: general/branch/cond

trait JNA extends InstructionDefinition {
  val mnemonic = "JNA"
}

object JNA extends OneOperand[JNA] with JNAImpl

trait JNAImpl extends JNA {
  implicit object JNA_0 extends _1[rel8] {
    val opcode: OneOpcode = 0x76
    val format = ImmFormat
  }

  implicit object JNA_1 extends _1[rel16] {
    val opcode: TwoOpcodes = (0x0F, 0x86)
    val format = ImmFormat
  }

  implicit object JNA_2 extends _1[rel32] {
    val opcode: TwoOpcodes = (0x0F, 0x86)
    val format = ImmFormat
  }
}
