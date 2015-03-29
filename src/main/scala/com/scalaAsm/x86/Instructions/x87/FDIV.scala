package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Divide
// Category: general/arith

trait FDIV extends InstructionDefinition {
  val mnemonic = "FDIV"
}

object FDIV extends FDIV with FDIVImpl

trait FDIVImpl {
  self: FDIV =>
  implicit object FDIV_0 extends _1[m32] {
    val opcode: OneOpcode = 0xD8 /+ 6
    override def hasImplicitOperand = true
  }

  implicit object FDIV_1 extends _1[m64] {
    val opcode: OneOpcode = 0xDC /+ 6
    override def hasImplicitOperand = true
  }
}
