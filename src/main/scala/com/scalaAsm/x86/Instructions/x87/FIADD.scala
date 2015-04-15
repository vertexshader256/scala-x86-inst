package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Add
// Category: general/arith

trait FIADD extends InstructionDefinition {
  val mnemonic = "FIADD"
}

object FIADD extends OneOperand[FIADD] with FIADDImpl

trait FIADDImpl extends FIADD {
  implicit object FIADD_0 extends _1[m32] {
    val opcode: OneOpcode = 0xDA /+ 0
    override def hasImplicitOperand = true
  }

  implicit object FIADD_1 extends _1[m16] {
    val opcode: OneOpcode = 0xDE /+ 0
    override def hasImplicitOperand = true
  }
}
