package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Jump short if not below or equal/above (CF=0 AND ZF=0)
// Category: general/branch/cond

trait JA extends InstructionDefinition {
  val mnemonic = "JA"
}

object JA extends OneOperand[JA] with JAImpl

trait JAImpl extends JA {
  implicit object JA_0 extends _1[rel8] {
    val opcode: OneOpcode = 0x77
    val format = ImmFormat
  }

  implicit object JA_1 extends _1[rel16] {
    val opcode: TwoOpcodes = (0x0F, 0x87)
    val format = ImmFormat
  }

  implicit object JA_2 extends _1[rel32] {
    val opcode: TwoOpcodes = (0x0F, 0x87)
    val format = ImmFormat
  }
}
