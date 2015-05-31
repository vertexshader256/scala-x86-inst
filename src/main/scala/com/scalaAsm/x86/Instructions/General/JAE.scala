package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Jump short if not below/above or equal/not carry (CF=0)
// Category: general/branch/cond

trait JAE extends InstructionDefinition {
  val mnemonic = "JAE"
}

object JAE extends OneOperand[JAE] with JAEImpl

trait JAEImpl extends JAE {
  implicit object JAE_0 extends _1[rel8] {
    val opcode: OneOpcode = 0x73
    val format = ImmFormat
    val hasRMByte = false
  }

  implicit object JAE_1 extends _1[rel16] {
    val opcode: TwoOpcodes = (0x0F, 0x83)
    val format = ImmFormat
    val hasRMByte = false
  }

  implicit object JAE_2 extends _1[rel32] {
    val opcode: TwoOpcodes = (0x0F, 0x83)
    val format = ImmFormat
    val hasRMByte = false
  }
}
