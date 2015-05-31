package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Jump short if parity/parity even (PF=1)
// Category: general/branch/cond

trait JPE extends InstructionDefinition {
  val mnemonic = "JPE"
}

object JPE extends OneOperand[JPE] with JPEImpl

trait JPEImpl extends JPE {
  implicit object JPE_0 extends _1[rel8] {
    val opcode: OneOpcode = 0x7A
    val format = ImmFormat
    val hasRMByte = false
  }

  implicit object JPE_1 extends _1[rel16] {
    val opcode: TwoOpcodes = (0x0F, 0x8A)
    val format = ImmFormat
    val hasRMByte = false
  }

  implicit object JPE_2 extends _1[rel32] {
    val opcode: TwoOpcodes = (0x0F, 0x8A)
    val format = ImmFormat
    val hasRMByte = false
  }
}
