package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Load Far Pointer
// Category: general/datamovsegreg

trait LFS extends InstructionDefinition {
  val mnemonic = "LFS"
}

object LFS extends TwoOperands[LFS] with LFSImpl

trait LFSImpl extends LFS {
  implicit object LFS_0 extends _2[r16, m] {
    val opcode: TwoOpcodes = (0x0F, 0xB4) /r
    val format = RegRmFormat
    override def hasImplicitOperand = true
    val hasRMByte = true
  }

  implicit object LFS_1 extends _2[r32, m] {
    val opcode: TwoOpcodes = (0x0F, 0xB4) /r
    val format = RegRmFormat
    override def hasImplicitOperand = true
    val hasRMByte = true
  }

  implicit object LFS_2 extends _2[r64, m] {
    val opcode: TwoOpcodes = (0x0F, 0xB4) /r
    override def prefix = REX.W(true)
    val format = RegRmFormat
    override def hasImplicitOperand = true
    val hasRMByte = true
  }
}
