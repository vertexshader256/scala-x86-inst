package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Absolute Value
// Category: general/arith

object FABS extends InstructionDefinition("FABS") with FABSImpl

trait FABSImpl {
  implicit object FABS_0 extends FABS._0 {
    val opcode: OneOpcode = 0xD9 /+ 4
    override def hasImplicitOperand = true
  }
}
