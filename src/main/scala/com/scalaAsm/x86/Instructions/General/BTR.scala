package com.scalaAsm.x86
package Instructions
package General

// Description: Bit Test and Reset
// Category: general/bit

trait BTR extends InstructionDefinition {
  val mnemonic = "BTR"
}

object BTR extends TwoOperands[BTR] with BTRImpl

trait BTRImpl extends BTR {
  implicit object _0 extends TwoOp[rm16, r16] {
    val opcode: TwoOpcodes = (0x0F, 0xB3) /r
    val format = MemRegFormat
  }

  implicit object _1 extends TwoOp[rm32, r32] {
    val opcode: TwoOpcodes = (0x0F, 0xB3) /r
    val format = MemRegFormat
  }

  implicit object _2 extends TwoOp[rm64, r64] {
    val opcode: TwoOpcodes = (0x0F, 0xB3) /r
    override def prefix = REX.W(true)
    val format = MemRegFormat
  }

  implicit object _3 extends TwoOp[rm16, imm8] {
    val opcode: TwoOpcodes = (0x0F, 0xBA) /+ 6
    val format = RmImmFormat
  }

  implicit object _4 extends TwoOp[rm32, imm8] {
    val opcode: TwoOpcodes = (0x0F, 0xBA) /+ 6
    val format = RmImmFormat
  }

  implicit object _5 extends TwoOp[rm64, imm8] {
    val opcode: TwoOpcodes = (0x0F, 0xBA) /+ 6
    override def prefix = REX.W(true)
    val format = RmImmFormat
  }
}
