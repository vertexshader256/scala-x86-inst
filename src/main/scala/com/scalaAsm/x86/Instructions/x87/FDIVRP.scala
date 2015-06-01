package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Reverse Divide and Pop
// Category: general/arith

trait FDIVRP extends InstructionDefinition {
  val mnemonic = "FDIVRP"
}

object FDIVRP extends ZeroOperands[FDIVRP] with FDIVRPImpl

trait FDIVRPImpl extends FDIVRP {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xDE /+ 6
        override def hasImplicitOperand = true
  }
}
