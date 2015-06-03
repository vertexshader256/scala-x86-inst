package com.scalaAsm.x86
package Instructions
package General

// Description: Bit Test and Set
// Category: general/bit

trait BTS extends InstructionDefinition {
  val mnemonic = "BTS"
}

object BTS extends TwoOperands[BTS] with BTSImpl

trait BTSImpl extends BTS {
  implicit object _0 extends TwoOp[rm16, r16] {
    val opcode: TwoOpcodes = (0x0F, 0xAB) /r
    val format = MemRegFormat
  }

  implicit object _1 extends TwoOp[rm32, r32] {
    val opcode: TwoOpcodes = (0x0F, 0xAB) /r
    val format = MemRegFormat
  }

  implicit object _2 extends TwoOp[rm64, r64] {
    val opcode: TwoOpcodes = (0x0F, 0xAB) /r
    override def prefix = REX.W(true)
    val format = MemRegFormat
  }

  implicit object _3 extends TwoOp[rm16, imm8] {
    val opcode: TwoOpcodes = (0x0F, 0xBA) /+ 5
    val format = RmImmFormat
  }

  implicit object _4 extends TwoOp[rm32, imm8] {
    val opcode: TwoOpcodes = (0x0F, 0xBA) /+ 5
    val format = RmImmFormat
  }

  implicit object _5 extends TwoOp[rm64, imm8] {
    val opcode: TwoOpcodes = (0x0F, 0xBA) /+ 5
    override def prefix = REX.W(true)
    val format = RmImmFormat
  }
}
