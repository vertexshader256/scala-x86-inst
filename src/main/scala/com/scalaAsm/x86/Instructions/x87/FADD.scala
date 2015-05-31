package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Add
// Category: general/arith

trait FADD extends InstructionDefinition {
  val mnemonic = "FADD"
}

object FADD extends OneOperand[FADD] with FADDImpl

trait FADDImpl extends FADD {
  implicit object FADD_0 extends _1[m32] {
    val opcode: OneOpcode = 0xD8 /+ 0
    val explicitFormat = new RmFormat{}
    override def hasImplicitOperand = true
  }

  implicit object FADD_1 extends _1[m64] {
    val opcode: OneOpcode = 0xDC /+ 0
    val explicitFormat = new RmFormat{}
    override def hasImplicitOperand = true
  }
}
