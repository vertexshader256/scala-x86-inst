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

object FDIVP extends FDIVP with ZeroOperands[FDIVP] with FDIVPImpl

trait FDIVPImpl {
  self: FDIVP =>
  implicit object FDIVP_0 extends _0 {
    val opcode: OneOpcode = 0xDE /+ 7
    override def hasImplicitOperand = true
  }
}
