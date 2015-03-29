package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Reverse Divide
// Category: general/arith

trait FDIVR extends InstructionDefinition {
  val mnemonic = "FDIVR"
}

object FDIVR extends FDIVR with FDIVRImpl

trait FDIVRImpl {
  self: FDIVR =>
  implicit object FDIVR_0 extends _1[m32] {
    val opcode: OneOpcode = 0xD8 /+ 7
    override def hasImplicitOperand = true
  }

  implicit object FDIVR_1 extends _1[m64] {
    val opcode: OneOpcode = 0xDC /+ 7
    override def hasImplicitOperand = true
  }
}
