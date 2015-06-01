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
  implicit object _0 extends TwoOp[rm16, r16] {
    val opcode: TwoOpcodes = (0x0F, 0xA3) /r
    val format = MemRegFormat
  }

  implicit object _1 extends TwoOp[rm32, r32] {
    val opcode: TwoOpcodes = (0x0F, 0xA3) /r
    val format = MemRegFormat
  }

  implicit object _2 extends TwoOp[rm64, r64] {
    val opcode: TwoOpcodes = (0x0F, 0xA3) /r
    override def prefix = REX.W(true)
    val format = MemRegFormat
  }

  implicit object _3 extends TwoOp[rm16, imm8] {
    val opcode: TwoOpcodes = (0x0F, 0xBA) /+ 4
    val format = RmImmFormat
  }

  implicit object _4 extends TwoOp[rm32, imm8] {
    val opcode: TwoOpcodes = (0x0F, 0xBA) /+ 4
    val format = RmImmFormat
  }

  implicit object _5 extends TwoOp[rm64, imm8] {
    val opcode: TwoOpcodes = (0x0F, 0xBA) /+ 4
    override def prefix = REX.W(true)
    val format = RmImmFormat
  }
}
