package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Subtract
// Category: general/arith

trait FSUB extends InstructionDefinition {
  val mnemonic = "FSUB"
}

object FSUB extends OneOperand[FSUB] with FSUBImpl

trait FSUBImpl extends FSUB {
  implicit object FSUB_0 extends _1[m32] {
    val opcode: OneOpcode = 0xD8 /+ 4
    val explicitFormat = new RmFormat{}
    override def hasImplicitOperand = true
  }

  implicit object FSUB_1 extends _1[m64] {
    val opcode: OneOpcode = 0xDC /+ 4
    val explicitFormat = new RmFormat{}
    override def hasImplicitOperand = true
  }
}
