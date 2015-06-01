package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Jump short if overflow (OF=1)
// Category: general/branch/cond

trait JO extends InstructionDefinition {
  val mnemonic = "JO"
}

object JO extends OneOperand[JO] with JOImpl

trait JOImpl extends JO {
  implicit object _0 extends OneOp[rel8] {
    val opcode: OneOpcode = 0x70
    val format = ImmFormat
  }

  implicit object _1 extends OneOp[rel16] {
    val opcode: TwoOpcodes = (0x0F, 0x80)
    val format = ImmFormat
  }

  implicit object _2 extends OneOp[rel32] {
    val opcode: TwoOpcodes = (0x0F, 0x80)
    val format = ImmFormat
  }
}
