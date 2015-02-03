package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Compute 2x-1
// Category: general/trans

object F2XM1 extends InstructionDefinition("F2XM1") with F2XM1Impl

trait F2XM1Impl {
  implicit object F2XM1_0 extends F2XM1._0 {
    val opcode: OneOpcode = 0xD9 /+ 6
    override def hasImplicitOperand = true
  }
}
