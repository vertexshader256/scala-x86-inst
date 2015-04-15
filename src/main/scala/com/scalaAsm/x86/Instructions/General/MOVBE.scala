package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Move Data After Swapping Bytes
// Category: general/datamov

trait MOVBE extends InstructionDefinition {
  val mnemonic = "MOVBE"
}

object MOVBE extends TwoOperands[MOVBE] with MOVBEImpl

trait MOVBEImpl extends MOVBE {
  implicit object MOVBE_0 extends _2[r16, m16] {
    val opcode: TwoOpcodes = (0x0F, 0x38) /r
  }

  implicit object MOVBE_1 extends _2[r32, m32] {
    val opcode: TwoOpcodes = (0x0F, 0x38) /r
  }

  implicit object MOVBE_2 extends _2[r64, m64] {
    val opcode: TwoOpcodes = (0x0F, 0x38) /r
    override def prefix = REX.W(true)
  }

  implicit object MOVBE_3 extends _2[m16, r16] {
    val opcode: TwoOpcodes = (0x0F, 0x38) /r
  }

  implicit object MOVBE_4 extends _2[m32, r32] {
    val opcode: TwoOpcodes = (0x0F, 0x38) /r
  }

  implicit object MOVBE_5 extends _2[m64, r64] {
    val opcode: TwoOpcodes = (0x0F, 0x38) /r
    override def prefix = REX.W(true)
  }
}
