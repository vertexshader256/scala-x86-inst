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
  implicit object _0 extends TwoOp[rm16, imm8] {
    val opcode: TwoOpcodes = (0x0F, 0xBA) /+ 7
    val format = RmImmFormat
  }

  implicit object _1 extends TwoOp[rm32, imm8] {
    val opcode: TwoOpcodes = (0x0F, 0xBA) /+ 7
    val format = RmImmFormat
  }

  implicit object _2 extends TwoOp[rm64, imm8] {
    val opcode: TwoOpcodes = (0x0F, 0xBA) /+ 7
    override def prefix = REX.W(true)
    val format = RmImmFormat
  }

  implicit object _3 extends TwoOp[rm16, r16] {
    val opcode: TwoOpcodes = (0x0F, 0xBB) /r
    val format = MemRegFormat
  }

  implicit object _4 extends TwoOp[rm32, r32] {
    val opcode: TwoOpcodes = (0x0F, 0xBB) /r
    val format = MemRegFormat
  }

  implicit object _5 extends TwoOp[rm64, r64] {
    val opcode: TwoOpcodes = (0x0F, 0xBB) /r
    override def prefix = REX.W(true)
    val format = MemRegFormat
  }
}
