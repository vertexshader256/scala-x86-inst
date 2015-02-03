package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Extract Exponent and Significand
// Category: general/arith

object FXTRACT extends InstructionDefinition("FXTRACT") with FXTRACTImpl

trait FXTRACTImpl {
  implicit object FXTRACT_0 extends FXTRACT._0 {
    val opcode: OneOpcode = 0xD9 /+ 6
    override def hasImplicitOperand = true
  }
}
