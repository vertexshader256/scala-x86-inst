package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: IEEE Partial Remainder
// Category: general/arith

object FPREM1 extends InstructionDefinition("FPREM1") with FPREM1Impl

trait FPREM1Impl {
  implicit object FPREM1_0 extends FPREM1._0 {
    val opcode: OneOpcode = 0xD9 /+ 6
    override def hasImplicitOperand = true
  }
}
