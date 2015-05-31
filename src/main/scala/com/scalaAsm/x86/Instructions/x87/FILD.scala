package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Load Integer
// Category: general/datamov

trait FILD extends InstructionDefinition {
  val mnemonic = "FILD"
}

object FILD extends OneOperand[FILD] with FILDImpl

trait FILDImpl extends FILD {
  implicit object FILD_0 extends _1[m32] {
    val opcode: OneOpcode = 0xDB /+ 0
    val explicitFormat = new RmFormat{}
    override def hasImplicitOperand = true
  }

  implicit object FILD_1 extends _1[m16] {
    val opcode: OneOpcode = 0xDF /+ 0
    val explicitFormat = new RmFormat{}
    override def hasImplicitOperand = true
  }
}
