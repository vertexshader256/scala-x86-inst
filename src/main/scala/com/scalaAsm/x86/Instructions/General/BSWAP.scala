package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Byte Swap
// Category: general/datamov

object BSWAP extends InstructionDefinition("BSWAP") with BSWAPImpl

trait BSWAPImpl {
  implicit object BSWAP_0 extends BSWAP._1[r16] {
    val opcode: TwoOpcodes = (0x0F, 0xC8)
    override def explicitFormat(op1: r16) = Some(InstructionFormat(addressingForm = NoModRM(), immediate = None))
  }

  implicit object BSWAP_1 extends BSWAP._1[r32] {
    val opcode: TwoOpcodes = (0x0F, 0xC8)
    override def explicitFormat(op1: r32) = Some(InstructionFormat(addressingForm = NoModRM(), immediate = None))
  }

  implicit object BSWAP_2 extends BSWAP._1[r64] {
    val opcode: TwoOpcodes = (0x0F, 0xC8)
    override def prefix = REX.W(true)
    override def explicitFormat(op1: r64) = Some(InstructionFormat(addressingForm = NoModRM(), immediate = None))
  }
}
