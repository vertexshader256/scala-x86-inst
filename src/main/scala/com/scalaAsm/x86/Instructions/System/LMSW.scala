package com.scalaAsm.x86
package Instructions
package System

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Load Machine Status Word
// Category: general

object LMSW extends InstructionDefinition("LMSW") with LMSWImpl

trait LMSWImpl {
  implicit object LMSW_0 extends LMSW._1[rm16] {
    val opcode: TwoOpcodes = (0x0F, 0x01) /+ 6
    override def hasImplicitOperand = true
  }
}
