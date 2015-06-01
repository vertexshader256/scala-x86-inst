package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Conditional Move - not less/greater or equal (SF=OF)
// Category: general/datamov

trait CMOVGE extends InstructionDefinition {
  val mnemonic = "CMOVGE"
}

object CMOVGE extends TwoOperands[CMOVGE] with CMOVGEImpl

trait CMOVGEImpl extends CMOVGE {
  implicit object CMOVGE_0 extends _2[r16, rm16] {
    val opcode: TwoOpcodes = (0x0F, 0x4D) /r
    val format = RegRmFormat
  }

  implicit object CMOVGE_1 extends _2[r32, rm32] {
    val opcode: TwoOpcodes = (0x0F, 0x4D) /r
    val format = RegRmFormat
  }

  implicit object CMOVGE_2 extends _2[r64, rm64] {
    val opcode: TwoOpcodes = (0x0F, 0x4D) /r
    override def prefix = REX.W(true)
    val format = RegRmFormat
  }
}
