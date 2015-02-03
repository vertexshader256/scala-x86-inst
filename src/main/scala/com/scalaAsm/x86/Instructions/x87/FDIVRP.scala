package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Reverse Divide and Pop
// Category: general/arith

object FDIVRP extends InstructionDefinition("FDIVRP") with FDIVRPImpl

trait FDIVRPImpl {
  implicit object FDIVRP_0 extends FDIVRP._0 {
    val opcode: OneOpcode = 0xDE /+ 6
    override def hasImplicitOperand = true
  }
}
