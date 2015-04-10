package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Load Far Pointer
// Category: general/datamovsegreg

trait LSS extends InstructionDefinition {
  val mnemonic = "LSS"
}

object LSS extends LSS with TwoOperands[LSS] with LSSImpl

trait LSSImpl {
  self: LSS =>
  implicit object LSS_0 extends _2[r16, m] {
    val opcode: TwoOpcodes = (0x0F, 0xB2) /r
    override def hasImplicitOperand = true
  }

  implicit object LSS_1 extends _2[r32, m] {
    val opcode: TwoOpcodes = (0x0F, 0xB2) /r
    override def hasImplicitOperand = true
  }

  implicit object LSS_2 extends _2[r64, m] {
    val opcode: TwoOpcodes = (0x0F, 0xB2) /r
    override def prefix = REX.W(true)
    override def hasImplicitOperand = true
  }
}
