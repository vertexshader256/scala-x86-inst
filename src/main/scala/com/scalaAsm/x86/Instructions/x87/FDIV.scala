package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Divide
// Category: general/arith

object FDIV extends InstructionDefinition("FDIV") with FDIVImpl

trait FDIVImpl {
  implicit object FDIV_0 extends FDIV._1[m32] {
    val opcode: OneOpcode = 0xD8 /+ 6
    override def hasImplicitOperand = true
  }

  implicit object FDIV_1 extends FDIV._1[m64] {
    val opcode: OneOpcode = 0xDC /+ 6
    override def hasImplicitOperand = true
  }
}
