package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Divide and Pop
// Category: general/arith

trait FDIVP extends InstructionDefinition {
  val mnemonic = "FDIVP"
}

object FDIVP extends ZeroOperands[FDIVP] with FDIVPImpl

trait FDIVPImpl extends FDIVP {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xDE /+ 7
        override def hasImplicitOperand = true
  }
}
