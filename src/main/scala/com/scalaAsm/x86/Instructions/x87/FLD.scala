package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Load Floating Point Value
// Category: general/datamov

trait FLD extends InstructionDefinition {
  val mnemonic = "FLD"
}

object FLD extends OneOperand[FLD] with FLDImpl

trait FLDImpl extends FLD {
  implicit object FLD_0 extends _1[m32] {
    val opcode: OneOpcode = 0xD9 /+ 0
    val explicitFormat = new RmFormat{}
    override def hasImplicitOperand = true
  }

  implicit object FLD_1 extends _1[m64] {
    val opcode: OneOpcode = 0xDD /+ 0
    val explicitFormat = new RmFormat{}
    override def hasImplicitOperand = true
  }
}
