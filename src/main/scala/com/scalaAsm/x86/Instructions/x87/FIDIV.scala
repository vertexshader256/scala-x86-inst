package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Divide
// Category: general/arith

object FIDIV extends InstructionDefinition("FIDIV") with FIDIVImpl

trait FIDIVImpl {
  implicit object FIDIV_0 extends FIDIV._1[m32] {
    val opcode: OneOpcode = 0xDA /+ 6
    override def hasImplicitOperand = true
  }

  implicit object FIDIV_1 extends FIDIV._1[m16] {
    val opcode: OneOpcode = 0xDE /+ 6
    override def hasImplicitOperand = true
  }
}
