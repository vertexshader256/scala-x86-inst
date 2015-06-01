package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Bit Test and Complement
// Category: general/bit

trait BTC extends InstructionDefinition {
  val mnemonic = "BTC"
}

object BTC extends TwoOperands[BTC] with BTCImpl

trait BTCImpl extends BTC {
  implicit object BTC_0 extends _2[rm16, imm8] {
    val opcode: TwoOpcodes = (0x0F, 0xBA) /+ 7
    val format = RmImmFormat
  }

  implicit object BTC_1 extends _2[rm32, imm8] {
    val opcode: TwoOpcodes = (0x0F, 0xBA) /+ 7
    val format = RmImmFormat
  }

  implicit object BTC_2 extends _2[rm64, imm8] {
    val opcode: TwoOpcodes = (0x0F, 0xBA) /+ 7
    override def prefix = REX.W(true)
    val format = RmImmFormat
  }

  implicit object BTC_3 extends _2[rm16, r16] {
    val opcode: TwoOpcodes = (0x0F, 0xBB) /r
    val format = MemRegFormat
  }

  implicit object BTC_4 extends _2[rm32, r32] {
    val opcode: TwoOpcodes = (0x0F, 0xBB) /r
    val format = MemRegFormat
  }

  implicit object BTC_5 extends _2[rm64, r64] {
    val opcode: TwoOpcodes = (0x0F, 0xBB) /r
    override def prefix = REX.W(true)
    val format = MemRegFormat
  }
}
