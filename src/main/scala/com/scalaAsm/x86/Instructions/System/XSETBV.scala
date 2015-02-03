package com.scalaAsm.x86
package Instructions
package System

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Set Extended Control Register
// Category: general

object XSETBV extends InstructionDefinition("XSETBV") with XSETBVImpl

trait XSETBVImpl {
  implicit object XSETBV_0 extends XSETBV._0 {
    val opcode: TwoOpcodes = (0x0F, 0x01) /+ 2
    override def hasImplicitOperand = true
  }
}
