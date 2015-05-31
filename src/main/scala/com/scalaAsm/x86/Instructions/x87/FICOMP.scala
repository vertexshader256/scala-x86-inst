package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Compare Integer and Pop
// Category: general/compar

trait FICOMP extends InstructionDefinition {
  val mnemonic = "FICOMP"
}

object FICOMP extends OneOperand[FICOMP] with FICOMPImpl

trait FICOMPImpl extends FICOMP {
  implicit object FICOMP_0 extends _1[m32] {
    val opcode: OneOpcode = 0xDA /+ 3
    val explicitFormat = new RmFormat{}
    override def hasImplicitOperand = true
  }

  implicit object FICOMP_1 extends _1[m16] {
    val opcode: OneOpcode = 0xDE /+ 3
    val explicitFormat = new RmFormat{}
    override def hasImplicitOperand = true
  }
}
