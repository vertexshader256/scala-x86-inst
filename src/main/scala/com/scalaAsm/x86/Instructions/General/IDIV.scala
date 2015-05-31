package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Signed Divide
// Category: general/arith/binary

trait IDIV extends InstructionDefinition {
  val mnemonic = "IDIV"
}

object IDIV extends OneOperand[IDIV] with IDIVImpl

trait IDIVImpl extends IDIV {
  implicit object IDIV_0 extends _1[rm8] {
    val opcode: OneOpcode = 0xF6 /+ 7
    val format = RmFormat
    override def hasImplicitOperand = true
    val hasRMByte = true
  }

  implicit object IDIV_1 extends _1[rm16] {
    val opcode: OneOpcode = 0xF7 /+ 7
    val format = RmFormat
    override def hasImplicitOperand = true
    val hasRMByte = true
  }

  implicit object IDIV_2 extends _1[rm32] {
    val opcode: OneOpcode = 0xF7 /+ 7
    val format = RmFormat
    override def hasImplicitOperand = true
    val hasRMByte = true
  }

  implicit object IDIV_3 extends _1[rm64] {
    val opcode: OneOpcode = 0xF7 /+ 7
    override def prefix = REX.W(true)
    val format = RmFormat
    override def hasImplicitOperand = true
    val hasRMByte = true
  }
}
