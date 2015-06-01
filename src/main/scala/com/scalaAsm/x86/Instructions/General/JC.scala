package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Jump short if below/not above or equal/carry (CF=1)
// Category: general/branch/cond

trait JC extends InstructionDefinition {
  val mnemonic = "JC"
}

object JC extends OneOperand[JC] with JCImpl

trait JCImpl extends JC {
  implicit object _0 extends OneOp[rel8] {
    val opcode: OneOpcode = 0x72
    val format = ImmFormat
  }

  implicit object _1 extends OneOp[rel16] {
    val opcode: TwoOpcodes = (0x0F, 0x82)
    val format = ImmFormat
  }

  implicit object _2 extends OneOp[rel32] {
    val opcode: TwoOpcodes = (0x0F, 0x82)
    val format = ImmFormat
  }
}
