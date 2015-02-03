package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Load Effective Address
// Category: general/datamov

object LEA extends InstructionDefinition("LEA") with LEAImpl

trait LEAImpl {
  implicit object LEA_0 extends LEA._2[r16, m] {
    val opcode: OneOpcode = 0x8D /r
  }

  implicit object LEA_1 extends LEA._2[r32, m] {
    val opcode: OneOpcode = 0x8D /r
  }

  implicit object LEA_2 extends LEA._2[r64, m] {
    val opcode: OneOpcode = 0x8D /r
    override def prefix = REX.W(true)
  }
}
