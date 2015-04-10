package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Compare Real
// Category: general/compar

trait FCOM extends InstructionDefinition {
  val mnemonic = "FCOM"
}

object FCOM extends FCOM with ZeroOperands[FCOM] with OneOperand[FCOM] with FCOMImpl

trait FCOMImpl {
  self: FCOM =>
  implicit object FCOM_0 extends _1[m32fp] {
    val opcode: OneOpcode = 0xD8 /+ 2
    override def hasImplicitOperand = true
  }

  implicit object FCOM_1 extends _0 {
    val opcode: OneOpcode = 0xD8 /+ 2
    override def hasImplicitOperand = true
  }

  implicit object FCOM_2 extends _1[m64] {
    val opcode: OneOpcode = 0xDC /+ 2
    override def hasImplicitOperand = true
  }
}
