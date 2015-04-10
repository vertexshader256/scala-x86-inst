package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Compare and Exchange Bytes
// Category: general/datamovarith/binary

trait CMPXCHG16B extends InstructionDefinition {
  val mnemonic = "CMPXCHG16B"
}

object CMPXCHG16B extends CMPXCHG16B with OneOperand[CMPXCHG16B] with CMPXCHG16BImpl

trait CMPXCHG16BImpl {
  self: CMPXCHG16B =>
  implicit object CMPXCHG16B_0 extends _1[m128] {
    val opcode: TwoOpcodes = (0x0F, 0xC7) /+ 1
    override def hasImplicitOperand = true
  }
}
