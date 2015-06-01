package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Jump short if not below/above or equal/not carry (CF=0)
// Category: general/branch/cond

trait JNC extends InstructionDefinition {
  val mnemonic = "JNC"
}

object JNC extends OneOperand[JNC] with JNCImpl

trait JNCImpl extends JNC {
  implicit object JNC_0 extends _1[rel8] {
    val opcode: OneOpcode = 0x73
    val format = ImmFormat
  }

  implicit object JNC_1 extends _1[rel16] {
    val opcode: TwoOpcodes = (0x0F, 0x83)
    val format = ImmFormat
  }

  implicit object JNC_2 extends _1[rel32] {
    val opcode: TwoOpcodes = (0x0F, 0x83)
    val format = ImmFormat
  }
}
