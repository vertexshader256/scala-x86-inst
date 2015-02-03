package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Scale
// Category: general/arith

object FSCALE extends InstructionDefinition("FSCALE") with FSCALEImpl

trait FSCALEImpl {
  implicit object FSCALE_0 extends FSCALE._0 {
    val opcode: OneOpcode = 0xD9 /+ 7
    override def hasImplicitOperand = true
  }
}
