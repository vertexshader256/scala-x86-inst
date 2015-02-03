package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Load Far Pointer
// Category: general/datamovsegreg

object LDS extends InstructionDefinition("LDS") with LDSImpl

trait LDSImpl {
  implicit object LDS_0 extends LDS._2[r16, m] {
    val opcode: OneOpcode = 0xC5 /r
    override def hasImplicitOperand = true
  }

  implicit object LDS_1 extends LDS._2[r32, m] {
    val opcode: OneOpcode = 0xC5 /r
    override def hasImplicitOperand = true
  }
}
