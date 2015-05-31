package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Bit Test and Reset
// Category: general/bit

trait BTR extends InstructionDefinition {
  val mnemonic = "BTR"
}

object BTR extends TwoOperands[BTR] with BTRImpl

trait BTRImpl extends BTR {
  implicit object BTR_0 extends _2[rm16, r16] {
    val opcode: TwoOpcodes = (0x0F, 0xB3) /r
    val format = MemRegFormat
    val hasRMByte = true
  }

  implicit object BTR_1 extends _2[rm32, r32] {
    val opcode: TwoOpcodes = (0x0F, 0xB3) /r
    val format = MemRegFormat
    val hasRMByte = true
  }

  implicit object BTR_2 extends _2[rm64, r64] {
    val opcode: TwoOpcodes = (0x0F, 0xB3) /r
    override def prefix = REX.W(true)
    val format = MemRegFormat
    val hasRMByte = true
  }

  implicit object BTR_3 extends _2[rm16, imm8] {
    val opcode: TwoOpcodes = (0x0F, 0xBA) /+ 6
    val format = RmImmFormat
    val hasRMByte = true
  }

  implicit object BTR_4 extends _2[rm32, imm8] {
    val opcode: TwoOpcodes = (0x0F, 0xBA) /+ 6
    val format = RmImmFormat
    val hasRMByte = true
  }

  implicit object BTR_5 extends _2[rm64, imm8] {
    val opcode: TwoOpcodes = (0x0F, 0xBA) /+ 6
    override def prefix = REX.W(true)
    val format = RmImmFormat
    val hasRMByte = true
  }
}
