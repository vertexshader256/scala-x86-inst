package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Input from Port to String
// Category: general/inoutstring

object INSW extends InstructionDefinition("INSW") with INSWImpl

trait INSWImpl {
  implicit object INSW_0 extends INSW._0 {
    val opcode: OneOpcode = 0x6D
    override def hasImplicitOperand = true
  }
}
