package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Square Root
// Category: general/arith

object FSQRT extends InstructionDefinition("FSQRT") with FSQRTImpl

trait FSQRTImpl {
  implicit object FSQRT_0 extends FSQRT._0 {
    val opcode: OneOpcode = 0xD9 /+ 7
    override def hasImplicitOperand = true
  }
}
