package com.scalaAsm.x86
package Instructions
package System

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Get Value of Extended Control Register
// Category: general

object XGETBV extends InstructionDefinition("XGETBV") with XGETBVImpl

trait XGETBVImpl {
  implicit object XGETBV_0 extends XGETBV._0 {
    val opcode: TwoOpcodes = (0x0F, 0x01) /+ 2
    override def hasImplicitOperand = true
  }
}
