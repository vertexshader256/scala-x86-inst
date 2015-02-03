package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Compare and Exchange Bytes
// Category: general/datamovarith/binary

object CMPXCHG8B extends InstructionDefinition("CMPXCHG8B") with CMPXCHG8BImpl

trait CMPXCHG8BImpl {
  implicit object CMPXCHG8B_0 extends CMPXCHG8B._1[m64] {
    val opcode: TwoOpcodes = (0x0F, 0xC7) /+ 1
    override def hasImplicitOperand = true
  }
}
