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
  implicit object _0 extends OneOp[m32] {
    val opcode: OneOpcode = 0xD8 /+ 3
    val format = RmFormat
    override def hasImplicitOperand = true
  }

  implicit object _1 extends NoOp{
    val opcode: OneOpcode = 0xD8 /+ 3
        override def hasImplicitOperand = true
  }

  implicit object _2 extends OneOp[m64] {
    val opcode: OneOpcode = 0xDC /+ 3
    val format = RmFormat
    override def hasImplicitOperand = true
  }
}
