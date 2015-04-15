package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Jump short if not parity/parity odd
// Category: general/branch/cond

trait JPO extends InstructionDefinition {
  val mnemonic = "JPO"
}

object JPO extends OneOperand[JPO] with JPOImpl

trait JPOImpl extends JPO {
  implicit object JPO_0 extends _1[rel8] {
    val opcode: OneOpcode = 0x7B
  }

  implicit object JPO_1 extends _1[rel16] {
    val opcode: TwoOpcodes = (0x0F, 0x8B)
  }

  implicit object JPO_2 extends _1[rel32] {
    val opcode: TwoOpcodes = (0x0F, 0x8B)
  }
}
