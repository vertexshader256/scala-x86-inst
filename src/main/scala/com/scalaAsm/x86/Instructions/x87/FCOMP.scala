package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Compare Real and Pop
// Category: general/compar

trait FCOMP extends InstructionDefinition {
  val mnemonic = "FCOMP"
}

object FCOMP extends ZeroOperands[FCOMP] with OneOperand[FCOMP] with FCOMPImpl

trait FCOMPImpl extends FCOMP {
  implicit object FCOMP_0 extends _1[m32] {
    val opcode: OneOpcode = 0xD8 /+ 3
    val format = RmFormat
    override def hasImplicitOperand = true
  }

  implicit object FCOMP_1 extends _0 {
    val opcode: OneOpcode = 0xD8 /+ 3
        override def hasImplicitOperand = true
  }

  implicit object FCOMP_2 extends _1[m64] {
    val opcode: OneOpcode = 0xDC /+ 3
    val format = RmFormat
    override def hasImplicitOperand = true
  }
}
