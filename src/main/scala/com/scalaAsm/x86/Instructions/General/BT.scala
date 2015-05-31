package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Bit Test
// Category: general/bit

trait BT extends InstructionDefinition {
  val mnemonic = "BT"
}

object BT extends TwoOperands[BT] with BTImpl

trait BTImpl extends BT {
  implicit object BT_0 extends _2[rm16, r16] {
    val opcode: TwoOpcodes = (0x0F, 0xA3) /r
    val format = MemRegFormat
    val hasRMByte = true
  }

  implicit object BT_1 extends _2[rm32, r32] {
    val opcode: TwoOpcodes = (0x0F, 0xA3) /r
    val format = MemRegFormat
    val hasRMByte = true
  }

  implicit object BT_2 extends _2[rm64, r64] {
    val opcode: TwoOpcodes = (0x0F, 0xA3) /r
    override def prefix = REX.W(true)
    val format = MemRegFormat
    val hasRMByte = true
  }

  implicit object BT_3 extends _2[rm16, imm8] {
    val opcode: TwoOpcodes = (0x0F, 0xBA) /+ 4
    val format = RmImmFormat
    val hasRMByte = true
  }

  implicit object BT_4 extends _2[rm32, imm8] {
    val opcode: TwoOpcodes = (0x0F, 0xBA) /+ 4
    val format = RmImmFormat
    val hasRMByte = true
  }

  implicit object BT_5 extends _2[rm64, imm8] {
    val opcode: TwoOpcodes = (0x0F, 0xBA) /+ 4
    override def prefix = REX.W(true)
    val format = RmImmFormat
    val hasRMByte = true
  }
}
