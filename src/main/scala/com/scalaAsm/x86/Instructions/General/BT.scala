package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Bit Test
// Category: general/bit

object BT extends InstructionDefinition("BT") with BTImpl

trait BTImpl {
  implicit object BT_0 extends BT._2[rm16, r16] {
    val opcode: TwoOpcodes = (0x0F, 0xA3) /r
  }

  implicit object BT_1 extends BT._2[rm32, r32] {
    val opcode: TwoOpcodes = (0x0F, 0xA3) /r
    override def explicitFormat(op1: rm32, op2: r32) = {
      if (op1.isInstanceOf[reg]) {
         Some(InstructionFormat(addressingForm = OnlyModRM(ModRMReg(TwoRegisters, op2, op1.asInstanceOf[reg])), immediate = None))
      } else None
    }
  }

  implicit object BT_2 extends BT._2[rm64, r64] {
    val opcode: TwoOpcodes = (0x0F, 0xA3) /r
    override def prefix = REX.W(true)
  }

  implicit object BT_3 extends BT._2[rm16, imm8] {
    val opcode: TwoOpcodes = (0x0F, 0xBA) /+ 4
  }

  implicit object BT_4 extends BT._2[rm32, imm8] {
    val opcode: TwoOpcodes = (0x0F, 0xBA) /+ 4
  }

  implicit object BT_5 extends BT._2[rm64, imm8] {
    val opcode: TwoOpcodes = (0x0F, 0xBA) /+ 4
    override def prefix = REX.W(true)
  }
}
