package com.scalaAsm.x86
package Instructions
package System

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Set Extended Control Register
// Category: general

trait XSETBV extends InstructionDefinition {
  val mnemonic = "XSETBV"
}

object XSETBV extends ZeroOperands[XSETBV] with XSETBVImpl

trait XSETBVImpl extends XSETBV {
  implicit object _0 extends NoOp{
    val opcode: TwoOpcodes = (0x0F, 0x01) /+ 2
        override def hasImplicitOperand = true
  }
}
