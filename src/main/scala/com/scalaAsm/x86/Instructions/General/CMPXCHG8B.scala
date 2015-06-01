package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Compare and Exchange Bytes
// Category: general/datamovarith/binary

trait CMPXCHG8B extends InstructionDefinition {
  val mnemonic = "CMPXCHG8B"
}

object CMPXCHG8B extends OneOperand[CMPXCHG8B] with CMPXCHG8BImpl

trait CMPXCHG8BImpl extends CMPXCHG8B {
  implicit object _0 extends OneOp[m64] {
    val opcode: TwoOpcodes = (0x0F, 0xC7) /+ 1
    val format = RmFormat
    override def hasImplicitOperand = true
  }
}
