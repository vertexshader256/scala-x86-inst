package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Compare and Exchange Bytes
// Category: general/datamovarith/binary

object CMPXCHG16B extends InstructionDefinition("CMPXCHG16B") with CMPXCHG16BImpl

trait CMPXCHG16BImpl {
  implicit object CMPXCHG16B_0 extends CMPXCHG16B._1[m128] {
    val opcode: TwoOpcodes = (0x0F, 0xC7) /+ 1
    override def hasImplicitOperand = true
  }
}
